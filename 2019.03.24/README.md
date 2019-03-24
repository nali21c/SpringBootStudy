#### 스프링부트 활용

##### Spring Application
- ApplicationEvent - Listner
- ApplicationStartedEvent 와 ApplicationStartingEvent 차이
- WebApplicationType(SERVLET, REACTIVE, NONE) - Sevlet 이 먼저
- 아규먼트 사용 : JVM option은 아규먼트가 아니다
- Application Runner
- CommandLineRunner
- @Order : 순서지정 가능(낮은 숫자가 우선순위 위)

##### 외부설정
- Application.properties : 우선순위가 있음
   * ${random}, server.port는 0이 랜덤값
   * 플레이스 홀더
- 묶기
   * ConfigurationProperties 사용