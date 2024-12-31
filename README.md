## 기능 목록

---
### 0. 스켈레톤 코드 작성

### 1. 컴퓨터 랜덤 3자리 숫자 생성
- 숫자는 중복 없는 1~9로 이루어진 3자리

### 2. 유저 숫자 입력 및 검증
- 숫자는 중복 없는 1~9로 이루어진 3자리

### 3. 결과 판단 후 출력
- 결과는 볼, 스트라이크, 낫싱
- 볼 + 스트라이크 <= 3
- 3스트라이크 => 정답

### 4. 정답 후 재시작 여부
- 3스트라이크 후 재시작 여부 물어봄
- 1 입력하면 게임 재시작, 2 입력하면 종료

---

---
## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```
