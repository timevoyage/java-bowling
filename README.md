# 볼링 게임 점수판
## 진행 방법
* 볼링 게임 점수판 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 볼링 게임 기능
* 사용자로부터 입력 받는 InputView를 구현한다.
* Console 전용 입력 View인 ConsoleInputView를 구현한다.
  * 플레이어의 이름을 입력받는다.
  * 프레임별 점수를 입력받는다.
* 볼링 게임 상태를 출력하는 OutputView를 구현한다.
* Console 전용 출력 View인 ConsoleOutputView를 구현한다.
  * 플레이어 이름을 물어보는 메시지를 출력한다.
  * 프레임별 점수를 물어보는 메시지를 출력한다.
  * 볼링 게임 틀을 출력한다.
  * 플레이어의 이름과 프레임별 점수를 출력한다.
* 플레이어의 이름인 Name을 구현한다.
  * Name의 이름이 알파벳이 아니면 예외를 던진다.
  * Name의 길이가 3자가 아니면 예외를 던진다.
* 핀을 넘어뜨린 개수를 PinNumber로 구현한다.
  * 0 ~ 10의 범위가 아니면 예외를 던진다.
* PinNumber의 일급 콜렉션인 PinNumbers를 구현한다.
* 이전 프레임의 상태를 enum인 Sequential로 표현한다.
  * 더블 스트라이크 - DOUBLE_STRIKE
  * 스트라이크 - STRIKE
  * 스페어 - SPARE
* 볼링 게임의 단위인 Frame을 구현한다.
  * 1 ~ 9 프레임은 NormalFrame으로 구현한다.
  * 10 프레임은 FinalFrame으로 구현한다.
  * 각 Frame은 FrameNumber와 PinNumbers 일급 콜렉션을 가진다.
  * 다음 Frame을 현재 Frame에서 생성하는 방식으로 구현한다.

# 질문 삭제하기 리팩토링
## 질문 삭제하기 기능
* 질문 데이터를 완전히 삭제하는 것이 아니라 데이터의 상태를 삭제 상태로 변경한다.
* 로그인 사용자와 질문한 사람이 같은 경우 삭제 가능하다.
* 답변이 없는 경우 삭제 가능하다.
* 질문자와 답변 글의 모든 답변자 같은 경우 삭제 가능하다.
* 질문을 삭제할 때 답변 또한 삭제해야 하며, 답변의 상태 또한 삭제 상태로 변경한다.
* 질문자와 답변자가 다를 경우 삭제할 수 없다.
* 질문과 답변 삭제 이력에 대한 정보를 DeleteHistory를 활용해 남긴다.
## 요구사항 정리
* 단위 테스트하기 어려운 코드와 단위 테스트 가능한 코드를 분리한다.
* 단위 테스트 가능한 코드에 대해 단위 테스트를 구현한다.