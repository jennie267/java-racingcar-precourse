# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 목록
* 자동차에 이름을 부여한다.
* 자동차는 random값에 따라 전진, 정지한다.
    - random값이 4 이상일 경우 전진, 3 이하의 값이면 멈춤
* 자동차의 현재 위치를 알 수 있다.
* 자동차 이름은 5자 이하만 가능하다.


* 사용자에게 자동차 이름을 입력 받는다.
    - 자동차 이름은 쉼표(,)를 기준으로 여러대를 만든다.
* 사용자에게 게임 횟수를 입력 받는다.
    - 사용자가 잘못된 값 입력시 재입력을 받는다.
* random값을 생성한다.
* 현재 위치가 제일 큰 자동차를 알 수 있다.


* 사용자가 잘못된 값 입력시 ERROR메시지를 출력한다.
* 게임중 실행 결과를 출력한다.
* 게임이 완료되면 우승자를 출력한다.
    - 우승자가 한명 이상일 경우, 쉼표(,)로 이름을 구분해 출력한다.