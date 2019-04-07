#### 스프링부트 활용

##### 외부설정
- 융통성 있는 바인딩 - Relexed Binding
   - 굳이 어떤 규칙에 의해 바인딩 할 필요는 없다.
- 프로퍼티 타입 컨버전
   - Spring Framework 가 제공하는 컨버전 서비스를 통해 일어남
   - Spring Boot -> Duration Unit(기본값은 30초)
   - Validated - NotEmpty 확인
   - Properties 사용시 그룹핑 해서 사용
   
##### 프로파일
- 어노테이션
   - @Configuration
   - prod, dev properites 파일 따로 관리 법
   - 배포 또는 개발시 확인 법
      - 개발시는 program-argument 활용
      - spring.profiles.include