# 질문답변 게시판
## 진행 방법
* 질문답변 게시판에 대한 html template은 src/main/resources 디렉토리의 static에서 확인할 수 있다. html template을 통해 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 코드스쿼드의 온라인 코드 리뷰 과정](https://github.com/code-squad/codesquad-docs/blob/master/codereview/README.md)
* [동영상으로 살펴보는 코드스쿼드의 온라인 코드 리뷰 과정](https://youtu.be/a5c9ku-_fok)


## Step1
* UserController : 사용자 관리 기능 구현을 담당
    * createUser() : static/user/form.html에서 사용자가 가입 요청(post 요청)을 처리
    * showUserList() : 가입 유저를 출력
    * showUserProfile() : userId가 맞는지 확인 후 가입 유저의 프로필을 보여줌
    * modifyUserProfile() : 프로필 수정부분
    * updateUserProfile() : 프로필 수정한것을 업데이트 하는 부분

* User : 사용자 데이터 저장 클래스
    * userId, password, name, email

* QuestionController : 질문 관리 기능 구현을 담당
    * createQuestion : 질문 작성 요청(post 요청)을 처리
    * showQuestionList : 질문 리스트 보여줌
    * showQuestionDetail : 질문 상세 보기

* Question : 질문 데이터 저장 클래스
    * writer, title, contents, time, id