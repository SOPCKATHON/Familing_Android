# Familing_Android

## 📌 서비스 이름, 소개



**가족과의 추억 스탬프 아카이빙 서비스** 



여성가족부 통계 자료에 따르면 가족과의 여가시간은 평일 1~2시간 이하인 경우가 74.2%라고 합니다. 
그만큼 가족과 보내는 시간이 적다는 이야기인데요. 

저희는 가장 작은 공동체인 가족과의 보내는 시간이 적다는 것에 문제를 느끼고, 
이를 해결하고자 행동심리학을 이용하여 가족들과 함께하는 시간을 늘리는 방식으로 문제를 해결하고자 합니다. 

가족과의 추억을 남기면 스탬프를 획득하는 방식으로 보상감을 느끼게 하였으며
지난달 대비 이번달의 가족과 보낸 시간을 카운팅 하여 가족과 더 많은 시간을 보내도록 동기부여 합니다. 

저희는 이런 방식을 통하여 많은 분들이 '가족'에 대한 의미를 되새기고 보다 더 친밀한 관계를 형성하도록 돕는 서비스가 될 것입니다.





## 📌 개발 담당 부분

#### 김효림 

- HomeActivity (BottomNavigation + ViewPager + FloatingActionButton)
- MyFragment



#### 박민우

- PostWriteFragment
- 서버 연동



#### 윤현지

- StampFragment
- Splash





## 📌 코드 컨벤션

#### => kotlin style guide 따르기

#### 🚩 Class Layout

다음과 같은 순서 클래스를 구성합니다

- Property 선언과 초기화 블럭(intializer blocks)
- 추가적인 생성자
- 메소드 정의
- 컴패니언 오브젝트(Companion object)

<br>

#### 🚩 Naming Rule

##### Package

- 패키지의 이름은 항상 소문자로 하고, 밑줄을 사용하지 않습니다
- 두 개 이상의 단어를 한 번에 사용하는 것을 금지합니다

<br>

##### Class/Object

- Pascal Case

```
open class SampleName { /* ... */ }
object MoreSampleName : SampleName() { /* ... */ }
```

<br>

##### Function/Parameter/Variable

- Camel Case

```
val initList = mutableList<SampleData>()
fun getList: List<SampleData>() { /* ... */ }
```

<br>

##### Constant

- Upper Snake Case
- 상수는 companion objet에 넣어 보관합니다

```
companion object {
    const val MAX_COUNT = 8
}
```

<br>

##### Resource naming

<img width="1091" alt="스크린샷 2021-08-13 오후 2 39 37" src="https://user-images.githubusercontent.com/61824695/142552864-9375be39-1b2c-4216-807c-fd43a6770184.png">

<br><br>

-----

## 📌 브랜치 전략

#### 🚩 프로젝트 폴더링

##### kotlin

- activity : 액티비티들을 모두 모아 둠
  - HomeActivity : 메인 화면
  - PostViewActivity : 게시물 보기 화면
  - PostWriteActivity : 게시물 쓰기 화면
- fragment : 프래그먼트들을 모두 모아 둠
  - BusinessCardFragment : 명함첩
  - CareerFragment : 커리어
  - CategoryDialogFragment : 글쓰기 항목 선택 시 나오는 다이얼로그
  - CommunityFragment : 커뮤니티
  - MypageFragment : 마이페이지
- adapter : Adapter와 관련한 모든 class 모음
  - HomeViewPagerAdapter : ViewPager2 작업을 위한 어댑터
  - BestPostAdapter : 커뮤니티 프래그먼트의 게시물(recyclerView)의 아이템을 변환하기 위한 어댑터
- util : Util과 관련한 class 모음
  - BestPostData : 게시물 recyclerView의 data class

<br>

##### layout

- anim : 애니메이션 작업을 위한 디렉토리
- color : 색상 작업을 위한 디렉토리
- drawable : 도형이나 svg파일, png파일 작업을 위한 디렉토리
- layout : 실제 보이는 화면들
- menu : BottomNavigationView의 menu 설정을 위한 폴더

<br>

### 🚩 git branch

- master : 최종 배포 작업물만 merge
- develop : 세부기능이 완벽하게 구현될때만 merge
  + 하위 branch는 activity, fragment 별로

<br>

#### git commit 예시

맨 앞에 어떤 작업을 했는지 명시, 그 후에 파일명 명시, 마지막에 작업 내용 써주기

- [Chore] Build.gradle / Manifest 수정
- [Feat] 기능추가
- [Refactor] 코드정리(기능구현 x)
- [Init] 초기설정

- [Add] HomeActivity BottomNavigationView
- [Delete] BestPostData data's post_num
- [Fix] BestPostAdapter item which index is 0~2 to gray3 color
- [Update] PostViewActivity setText main,sub category
- [UI] Change StatusBar Color Purple into White, Remove ActionBar, Add Font Style
