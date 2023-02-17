DROP TABLE MEMBER;

CREATE TABLE    MEMBER (
     USERID     VARCHAR2( 12 )  PRIMARY KEY
   , PASSWD     VARCHAR2( 12 )  NOT NULL
   , USERNAME  	VARCHAR2( 30 )  NOT NULL
   , JOB        VARCHAR2( 30 )
   , GENDER     VARCHAR2( 3 )
   , INTRO      VARCHAR2( 4000 )
   , INDATE     DATE          DEFAULT  SYSDATE 
);

-- job    : '회사원','학생','군인','없음'
-- gender : '남','여', null