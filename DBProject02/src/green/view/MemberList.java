package green.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import green.model.MemberDao;

public class MemberList  
	extends     JFrame 
	implements  ActionListener  {

	JButton       btnInsert,  btnRefresh, btnToExcel;
	JPanel        topPane;
	JTable        jTable;
	JScrollPane   pane; 
	
	MemberProc    mProc = null;  // 회원가입창 전역변수
	
	public  MemberList() {
		initComponent();
	}
	
	private  void initComponent() {
		setTitle("회원관리 프로그램 v1.0");
		
		topPane      =  new JPanel();
		btnInsert    =  new JButton("회원가입");  
		btnRefresh   =  new JButton("새로고침");  
		btnToExcel   =  new JButton("엑셀로 저장");

		topPane.add( btnInsert );
		topPane.add( btnRefresh );
		topPane.add( btnToExcel );
		
		// 버튼에 기능 부여
		// 회원가입버튼 클릭
		btnInsert.addActionListener( this );
		   // 이벤트핸들러(이벤트발생시 수행할 함수 - actionPreformed() )를 등록
		// 새로고침버튼 클릭
		btnRefresh.addActionListener( this );
		// 엑셀로 저장 버튼 클릭
		btnToExcel.addActionListener( this );
		
		this.add(topPane, BorderLayout.NORTH);
				
		// -----------------------		
		jTable      =   new  JTable();		
		// data 를 model 에 담아서 채움
		jTable.setModel(
			new DefaultTableModel( getDataList() , getColumnList() ) {				
				// 기본 option 설정 - 각 cell 에 대한 편집가능여부 :isCellEditable
				@Override
				public boolean isCellEditable(int row, int column) {
				//	int  currLine = jTable.getSelectedRow();  // 선택한 줄만 수정가능
				//	if( row == currLine  )
				//		return true;			
					return false;   // 모든 cell 편집불가능
				}				
			}	
		);
		
		
		pane  = new JScrollPane( jTable );
		this.add( pane );
				
		//----------------------------------------------		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(600, 500);
		setLocation(200, 200);
		setVisible(true);
		
	}
	
	// data 목록
	//  <? extends Vector> : Vector 를 상속받은 Type 만 가능하다
	// Vector<? extends Vector> : Vector안에 Vector 타입만 저장가능 
	//  - 2차원배열 : ResultSet을 받기위해 
	//  Vector< Vector > : 안쪽   Vector : ResultSet 의 한 Row - Record
	//                   : 바깥쪽 Vector : ResultSet 전체  Table - Record 배열
	private Vector<? extends Vector> getDataList() {
		MemberDao       dao   =  new MemberDao();
		Vector<Vector>  list  =  dao.getMemberList();
		//Vector          list  =  dao.getMemberList();
		return  list;
	}

	// jTable 에 제목줄 생성 - 크기변경가능한 배열 : ArrayList -> Vector(swing)
	// ? : class Type 
	private Vector<?> getColumnList() {
		Vector<String>  cols = new Vector<>();  // 문자배열 대신 사용
		cols.add("아이디");
		cols.add("이름");
		cols.add("직업");
		cols.add("성별");
		cols.add("가입일");
		return  cols;
	}

	public static void main(String[] args) {
		new MemberList();
	}

	// implements ActionListener 를 위한 구현
	// 버튼들의 이벤트 처리
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch( e.getActionCommand() ) {  // 눌러진 버튼의 글자
		case "회원가입":
			// 회원가입창(MemberProc)을 연다
			System.out.println("회원가입클릭");
			if(  mProc != null )
				mProc.dispose();  // 강제로 닫는다
			mProc = new MemberProc( this );   // this : 현재 실행중인 MemberList 
			break;
		case "새로고침":
			// 새로고침 클릭
			System.out.println("새로고침 클릭");
			jTableRefresh();			
			break;
		case "엑셀로 저장":
			break;
		}
			
	}

	// jTable 새로고침 - data를 변경
	public void jTableRefresh() {
		
		jTable.setModel(
			new DefaultTableModel( getDataList(),  getColumnList()  ) {

				@Override
				public boolean isCellEditable(int row, int column) {					
					return false;
				}
				
			}
		);  // jtable 새로운 데이터를 지정
		
		jTable.repaint();  // jtable을 새로 그린다
	}

}








