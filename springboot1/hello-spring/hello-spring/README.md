Maven과 Gradle
- 필요한 라이브러를 가져오고 라이플 사이클까지 관리해주는 툴
- 요즘엔 Gradle을 많이 사용함. 리거시로는 Maven이 많음.


spring initializr
- 스프링 프로젝트 생성에 도움을 주는 웹 페이지
- start.spring.io

Metadata
- Group: 보통 기업 도메인 이름 같은걸 사용하지만 상관없음

Artifact: 빌드되는 결과명

Dependencies
- 스프링부트 프로젝트 생성에서 중요한것
- Spring Web
  - 웹 프로젝트를 만드는 것이므로 선택
- Thymeleaf 
  - template engine
  - html 템플릿의 일종

프로젝트 구조
- idea: 인텔리제이가 쓰는 프로젝트 구조
- src:
  - 요즘에는 main이랑 test가 구분되어있음
  - test에는 test 코드가 작성되어있음. 요즘 개발 트렌드에 있어서 test가 중요함
  - resources: java 파일을 제외한 모두
    - xml, 설정파일, html과 같은것들
- build.gradle
  - 예전에는 일일히 설정했던 스프링 설정들이 작성되어있음
  - gradle이 버전을 설정하고 라이브러리를 로드해줌. 나중에 공부
  - 스프링버전, 자바버전 등 작성되어있음
  - dependencies
    - 템플릿 엔진, spring web 등 선택한 설정이 작성되어있음
    - testImplementation: test 라이브러리가 기본적으로 되어있음
  - repositories: 라이브러리를 다운받은 소스

settings.gradle
- 나중에 gradle을 배우면 알게되지만 지금은 중요치 않음


---

## 라이브러리 살펴보기
External Libraries에 수많은 라이브러리가 있음.
- gradle이나 maven 같은 툴들은 의존관계를 관리해줌
  - springboot-starter-web이라는 라이브러리를 임포트하면 그 라이브러리가 필요한 라이브러리를 모두 임포트해서 관리해줌.
- 왼쪽 아래에 겹네모를 클릭해 오른쪽에 있는 gradle 을 클릭하면 라이브러리의 의존성을 계층적으로 확인할 수 있음.

---
Spring boot
- 거대한 스프링 생태계를 감쌈
- 필요한것을 찾는 능력이 중요함
- [스프링 부트 공식문서](https://docs.spring.io/spring-boot/docs/current/reference/html/)

thymeleaf 템플릿 엔진
- [타임리프 공식페이지](https://www.thymeleaf.org/)
- 