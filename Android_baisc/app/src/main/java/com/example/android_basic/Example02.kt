package com.example.android_basic

/**
 * Activity Lifecycle
 *앱의 완성도와 안정성을 위해서는 반드시 알아야함
 * ex.) 앱이 비실행중에 리소스 낭비, 사용자가 앱 전환 시 진행상태가 저장되지 않는 문제 등
 *
 *
 * 콜백
 * 1. onCreate
 * Activity 생명주기 중 한 번만 발생해야하는 로직을 실행
 * UI구현, 맴버 변수 정의
 * saveInstanceState 매개변수 수신 -> BUndle 객체로 이전 저장상태를 가져옴
 *
 * 2. onStart
 *
 * 3. onResume
 * 앱에서 포커스가 떠날 때 까지 이 상태에서 머문다, 사용자와 상호 작용
 *
 * 4. onPause
 * 아주 매우 짧기 때문에 네트워크 호출이나 DB작업 등 하면 안된다.
 *
 * 5. onStop
 * Activity가 사용자에게 더 이상 표시 되지 않는 상태
 * DB작업이나 네트워크 작업은 이 때
 *
 * 6. onDestroy
 * finish()로 명시적으로 끝내거나
 * configurationChange (ex. 기기회전, 멀티 윈도우)
 * */

/**
 * 1. Activity가 실행, 종료 생명주기
 * 액티비티 실행 시: onCreate -> onStart -> onResume
 * 액티비티 종료 시: (명시적으로 finish()) onPause -> onStop -> onDestroy
 *
 *
 * 2. 다른 앱 실행 시, 생명주기(홈버튼으로)
 * 홈버튼 클릭 시: onPause -> onStop
 * 백그라운드에서 다시 포커스 시: onRestart -> onStart -> onResume
 *
 * 3. 다른 Activity 실행 시, 생명주기
 *다른 액티비티 실행 시 기존 Activity: onPause -> onStop
 *다른 Activity: onCreate -> onStart -> onStop
 *다른 Activity에서 MainActivity로 back : Main은 onRestart -> onStart -> onResume
 *다른 Activity에서 MainActivity로 back : 다른Activity onPause -> onStop -> onDestroy
 * */
