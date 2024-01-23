<h1>📙 입문주차 개인과제</h1>

<h3>"나만의 일정 관리 앱 서버 만들기"</h3>

<h4>📌 요구사항 확인: 필수 구현 기능</h4>


▶︎ 일정 작성 기능
    • `할일 제목`, `할일 내용`, `담당자`, `비밀번호`, `작성일`을 저장할 수 있습니다.
    • 저장된 게시글의 정보를 반환 받아 확인할 수 있습니다.
        ◦ 반환 받은 게시글의 정보에 `비밀번호`는 제외 되어있습니다.
▶︎ 선택한 일정 조회 기능
    • 선택한 일정의 정보를 조회할 수 있습니다.
        ◦ 반환 받은 일정 정보에 `비밀번호`는 제외 되어있습니다.
▶︎ 일정 목록 조회 기능
    • 등록된 일정 전체를 조회할 수 있습니다.
        ◦ 반환 받은 일정 정보에 `비밀번호`는 제외 되어있습니다.
    • 조회된 일정 목록은 `작성일` 기준 내림차순으로 정렬 되어있습니다.
▶︎ 선택한 일정 수정 기능
    • 선택한 일정의 `할일 제목`,`할일 내용`, `담당자`을 수정할 수 있습니다.
        ◦ 서버에 일정 수정을 요청할 때 `비밀번호`를 함께 전달합니다.
        ◦ 선택한 일정의 `비밀번호`와 요청할 때 함께 보낸 `비밀번호`가 일치할 경우에만 수정이 가능합니다.
    • 수정된 일정의 정보를 반환 받아 확인할 수 있습니다.
        ◦ 반환 받은 일정의 정보에 `비밀번호`는 제외 되어있습니다.
▶︎ 선택한 일정 삭제 기능
    • 선택한 일정을 삭제할 수 있습니다.
        ◦ 서버에 일정 삭제를 요청할 때 `비밀번호`를 함께 전달합니다.
        ◦ 선택한 일정의 `비밀번호`와 요청할 때 함께 보낸 `비밀번호`가 일치할 경우에만 삭제가 가능합니다.

<h4>📌 Use Case Diagram</h4>


<h4>📌 API 명세서</h4>



<h4>📌 ERD</h4>

![schedule_diagram](https://github.com/oyeonjoo/schedule/assets/109337974/7fe5562d-eea7-4cb4-844d-24526b8b45cc)





Project Title
Simple overview of use/purpose.

Description
An in-depth paragraph about your project and overview of use.

Getting Started
Dependencies
Describe any prerequisites, libraries, OS version, etc., needed before installing program.
ex. Windows 10
Installing
How/where to download your program
Any modifications needed to be made to files/folders
Executing program
How to run the program
Step-by-step bullets
code blocks for commands
Help
Any advise for common problems or issues.

command to run if program contains helper info
Authors
Contributors names and contact info

ex. Dominique Pizzie
ex. @DomPizzie

Version History
0.2
Various bug fixes and optimizations
See commit change or See release history
0.1
Initial Release
License
This project is licensed under the [NAME HERE] License - see the LICENSE.md file for details

Acknowledgments
Inspiration, code snippets, etc.

awesome-readme
PurpleBooth
dbader
zenorocha
fvcproductions

