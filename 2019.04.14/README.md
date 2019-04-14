#### 스프링부트 활용

##### 로거
- 기본 포맷
- --debug(일부 핵심라이브러리만 디버깅 모드)
- trace(전부 디버깅 모드로)
- 컬러 출력 : spring.output.ansi.enabled
- 파일 출력 : logging.file 또는 logging.path
- 로그 레벨 조정 : logging.level.패키지 = 로그레벨

##### 로거 - 커스템 설정
- logback-spring.xml 및 그 밖의 설정
- 로거를 Log4j2로 변경

##### 테스트
- 기본 설정