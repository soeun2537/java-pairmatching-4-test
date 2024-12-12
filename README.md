# 최종 코딩테스트

## ✏️ 구현 기능 목록

### ✔️ 정상 입력 처리

#### 입력

- 선택할 기능 옵션을 입력받는다.
  - 기능 옵션에 대한 유효성을 검증한다.
    - 기능 옵션은 비어있을 수 없다.
    - 기능 옵션은 1,2,3,Q 형식이어야 한다.
- 1, 2 선택 시 과정, 레벨, 미션을 입력 받는다.
  - 과정, 레벨, 미션에 대한 유효성을 검증한다.
    - 과정, 레벨, 미션은 비어있을 수 없다.
    - 과정, 레벨, 미션은 존재하는 목록 내 존재해야 한다.
- 1 선택 시 매칭 정보가 있을 경우 여부를 입력받는다.
  - 여부에 대한 유효성을 검증한다.
    - 여부는 비어있을 수 없다.
    - 여부는 네, 아니오 형식이어야 한다.

#### 출력

- 기능 선택 안내 문구를 출력한다.
- 1 선택
  - 페어 매칭 결과가 있을 경우 재매칭 여부 안내를 출력한다.
  - 과정, 레벨, 미션을 입력받는 안내 문구를 출력한다.
  - 페어 매칭 결과를 출력한다.
- 2 선택
  - 과정, 레벨, 미션을 입력받는 안내 문구를 출력한다.
  - 페어 매칭 결과를 출력한다.
- 3 선택
  - 페어 매칭을 초기화한 후 안내 문구를 출력한다.

#### 기능

- 과정은 백엔드 과정과 프론트엔드 과정이 있다.
- 각 과정은 5단계로 나누어 진행되며, 이를 레벨이라 한다.
- 크루 정보 파일을 불러온다.
- 페어 매칭 조건
  - 페어는 두명씩 매칭한다.
  - 페어 매칭 대상이 홀수인 경우 한 페어는 3인으로 구성한다.
  - 같은 레벨 동안은 같은 페어를 만나지 않는다.
- 페어 매칭 구현 방법
  - 크루의 목록 순서를 랜덤으로 섞는다.
  - 앞에서부터 순서대로 두명씩 매칭한다.
  - 홀수인 경우 마지막 남은 크루는 마지막 페어에 포함시킨다.
  - 같은 레벨에서 이미 페어로 매칭된다면 다시 랜덤으로 섞는다.
  - 3회 시도까지 매칭이 되지 않거나 매칭을 할 수 있는 경우의 수가 없으면 에러 메시지를 출력한다.
- 페어 재매칭 시도
  - 안내 문구 출력 후 매칭을 진행한다.
  - 아니오를 선택할 경우 코스, 레벨, 미션을 다시 선택한다.
- 페어 조회 기능
  - 과정, 레벨, 미션을 선택하면 해당 미션의 페어 정보를 출력한다.
  - 매칭 이력이 없으면 매칭 이력이 없다고 안내한다.

### ⚠️ 예외

IllegalArgumentException을 발생시키고, "\[ERROR]"로 시작하는 오류 메시지를 출력한 후 해당 부분부터 다시 입력을 받는다.

<br>

## 💻 커밋 컨벤션

> [**AngularJS 커밋 컨벤션**](https://gist.github.com/stephenparish/9941e89d80e2bc58a153) 참고

| Type     | Description      |
|----------|------------------|
| feat     | 새로운 기능 추가        |
| fix      | 버그 수정            |
| docs     | 문서 변경            |
| style    | 코드 포맷 변경         |
| refactor | 코드 리팩토링          |
| test     | 테스트 추가 및 수정      |
| chore    | 빌드 작업 및 도구 관련 변경 |

<br>

## ✅ 체크 리스트

### 과제 진행 요구 사항

- [ ] 페어매칭 비공개 저장소를 생성한다.
- [ ] 우아한테크코스 계정을 collaborator로 초대한다.
- [ ] 진행한 과제는 저장소의 main 브랜치에 커밋한다.
- [ ] 기능을 구현하기 전에 README.md에 구현할 기능 목록을 정리해 추가한다.
- [ ] Git의 커밋은 README.md에 정리된 기능 목록 단위로 나눈다. (AngularJS Git Commit Message Conventions 참고)

### 입출력 요구 사항

- [ ] 프로그램을 시작하면 기능의 종류를 출력하고 그 중 하나의 입력을 받는다.
- [ ] 과정과 미션을 출력하고 매칭하고자 하는 과정, 레벨, 미션을 입력 받는다.
- [ ] 매칭이 정상적으로 수행되면 결과가 출력된다.
- [ ] 출력되는 페어의 순서는 shuffle 메서드의 결과 순서로 정렬한다.

### 실행 결과 예시

```
기능을 선택하세요.
1. 페어 매칭
2. 페어 조회
3. 페어 초기화
Q. 종료
1

#############################################
과정: 백엔드 | 프론트엔드
미션:
  - 레벨1: 자동차경주 | 로또 | 숫자야구게임
  - 레벨2: 장바구니 | 결제 | 지하철노선도
  - 레벨3: 
  - 레벨4: 성능개선 | 배포
  - 레벨5: 
############################################
과정, 레벨, 미션을 선택하세요.
ex) 백엔드, 레벨1, 자동차경주
프론트엔드, 레벨1, 자동차경주

페어 매칭 결과입니다.
다비 : 신디
쉐리 : 덴버
제키 : 로드
라라 : 윌터
니콜 : 이브
린다 : 시저
보노 : 제시 : 제키

기능을 선택하세요.
1. 페어 매칭
2. 페어 조회
3. 페어 초기화
Q. 종료
1

#############################################
과정: 백엔드 | 프론트엔드
미션:
  - 레벨1: 자동차경주 | 로또 | 숫자야구게임
  - 레벨2: 장바구니 | 결제 | 지하철노선도
  - 레벨3: 
  - 레벨4: 성능개선 | 배포
  - 레벨5: 
############################################
과정, 레벨, 미션을 선택하세요.
ex) 백엔드, 레벨1, 자동차경주
프론트엔드, 레벨1, 자동차경주

매칭 정보가 있습니다. 다시 매칭하시겠습니까?
네 | 아니오
아니오

과정, 레벨, 미션을 선택하세요.
ex) 백엔드, 레벨1, 자동차경주
프론트엔드, 레벨1, 자동차경주
매칭 정보가 있습니다. 다시 매칭하시겠습니까?
네 | 아니오
네

페어 매칭 결과입니다.
이브 : 윌터
보노 : 제키
신디 : 로드
제시 : 린다
시저 : 라라
니콜 : 다비
리사 : 덴버 : 제키

기능을 선택하세요.
1. 페어 매칭
2. 페어 조회
3. 페어 초기화
Q. 종료
2

#############################################
과정: 백엔드 | 프론트엔드
미션:
  - 레벨1: 자동차경주 | 로또 | 숫자야구게임
  - 레벨2: 장바구니 | 결제 | 지하철노선도
  - 레벨3: 
  - 레벨4: 성능개선 | 배포
  - 레벨5: 
############################################
과정, 레벨, 미션을 선택하세요.
ex) 백엔드, 레벨1, 자동차경주
프론트엔드, 레벨1, 자동차경주

페어 매칭 결과입니다.
이브 : 윌터
보노 : 제키
신디 : 로드
제시 : 린다
시저 : 라라
니콜 : 다비
리사 : 덴버 : 제키

기능을 선택하세요.
1. 페어 매칭
2. 페어 조회
3. 페어 초기화
Q. 종료
3

초기화 되었습니다. 

기능을 선택하세요.
1. 페어 매칭
2. 페어 조회
3. 페어 초기화
Q. 종료
Q
```

### 프로그래밍 요구 사항

- [ ] JDK 21에서 실행 가능해야 한다.
- [ ] 프로그램의 시작점은 Application의 main()이다.
- [ ] build.gradle 파일은 변경할 수 없으며, 제공된 라이브러리만 사용해야 한다.
- [ ] 프로그램 종료 시 System.exit()를 호출하지 않는다.
- [ ] 별도의 지시가 없는 한 파일, 패키지 등의 이름을 바꾸거나 이동하지 않는다.
- [ ] 자바 코드 컨벤션을 준수하여 프로그래밍한다. 기본적으로 Google Java Style Guide를 따른다.
- [ ] Indent(인덴트, 들여쓰기) depth는 최대 2까지만 허용한다. (메서드를 분리하는 것을 추천)
- [ ] 3항 연산자를 사용하지 않는다.
- [ ] 메서드는 한 가지 일만 하도록 최대한 작게 만든다.
- [ ] JUnit 5와 AssertJ를 사용하여 테스트 코드를 작성한다.
- [ ] else 예약어 및 switch-case 문 사용을 금지한다.
- [ ] Enum을 사용하여 구현한다.
- [ ] UI 로직((System.out, System.in, Scanner)을 제외한 구현 기능에 대해 단위 테스트를 작성한다.
- [ ] 메서드 길이는 10라인을 초과하지 않는다.
- [ ] 입출력을 담당하는 클래스를 별도로 구현한다.
  - [ ] 클래스 이름, 메서드 반환 유형, 시그니처 등은 자유롭게 수정할 수 있다.
- [ ] camp.nextstep.edu.missionutils에서 제공하는 Randoms 및 Console API를 사용하여 구현해야 한다.
  - [ ] Randoms.shuffle()를 사용하여 랜덤 값을 추출한다.
  - [ ] Console.readLine()을 사용하여 사용자 입력을 처리한다.