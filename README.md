# Socket
## 웹소켓(STOMP) 사용방법

### WebSocket을 사용하여 로그인 및 회원가입 구현

#### 

##### 사용된 데이터베이스 : MySQL - soju2
	CREATE DATABASE soju2;
	USE soju2;

##### 사용된 테이블 : Member, MetaRoom
	멤버 테이블
	CREATE TABLE Member (
		emailId VARCHAR(50) PRIMARY KEY, #이메일 형식 아이디
		pwd VARCHAR(255) NOT NULL, #비밀번호
		name VARCHAR(10) NOT NULL, #이름
		nickname VARCHAR(20) UNIQUE NOT NULL, #닉네임
		birthday DATE NOT NULL, #생년월일
		gender VARCHAR(1) NOT NULL, #성별
		phoneNumber VARCHAR(15) UNIQUE NOT NULL, #핸드폰 번호
		address VARCHAR(100) NOT NULL, #주소
		studyType VARCHAR(10) NOT NULL, #관심있는 분야
		platform VARCHAR(10) NOT NULL, #플랫폼
		roleName VARCHAR(100) NOT NULL #Spring Security 권한
	);
	
	메타버스 방
	CREATE TABLE MetaRoom (
		metaIdx INT PRIMARY KEY AUTO_INCREMENT, #방 번호
		metaTitle VARCHAR(50) NOT NULL, #방 제목
		metaType VARCHAR(10) NOT NULL, #방 분야
		metaPersonnel INT NOT NULL, #방 모집 인원
		metaRecruitingPersonnel INT NOT NULL #방 모집된 인원
	);
