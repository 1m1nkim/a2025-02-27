- 개요
“스프링 부트 + 스프링 시큐리티 + OAuth2 클라이언트 설정을 통해 카카오 로그인 기능을 손쉽게 구현할 수 있는 기본 템플릿 프로젝트입니다.”

- 주요 기능
  - 카카오 OAuth2 인증: application.yml에 KAKAO_CLIENT_ID를 설정하면 카카오 로그인 연동이 가능합니다.
  - 스프링 시큐리티 설정: /api/** 같은 엔드포인트에 인증이 필요하도록 설정하고, 인증되지 않은 요청에는 401을 반환하거나 /login으로 리다이렉트합니다.
  - CORS 설정: 프론트엔드(Next.js 등)와 연동할 수 있도록 CORS를 허용합니다.
  - H2 콘솔: 개발/테스트 용도로 H2 인메모리 DB와 콘솔을 사용할 수 있습니다.

- 사용 방법
  - 해당 프로젝트를 클론
  - application.yml 또는 application.properties에서 카카오 OAuth2 클라이언트 설정, DB 설정 수정
  - 프론트엔드(React/Next.js 등)에서 http://localhost:8080/oauth2/authorization/kakao로 이동하면 카카오 인증 가능
