package com.example.android_basic

/**
 * View가 그려지는 과정
 *
 *전위순회 방식을 사용해서 부모 부터 자식 뷰 순서로 그려진다.
 *
 * 1.measure(onMeasure)
 * 뷰의 크기를 계산
 * 각각 뷰의 width, height 계싼
 * 부모 - 자식 뷰간 크기 정보 전달을 위해 2가지 클래스를 사용
 * ViewGroup.LayoutParams: 자식 뷰가 부모 뷰에게 자신이 어떻게 측정되고 위치를 정할지 요청
 * DP, PX
 * MATCH_PARENT: 부모 뷰 사이즈와 똑같이 자식뷰 사이즈 지정
 * WRAP_CONTENT: 부모 뷰 안에서, CONTENT를 표현할 수 있는 fit 한 사이즈 지정
 *
 * ViewGroup.MeasureSpecs: 부모 뷰가 자식 뷰에게 요구사항을 전닿할 때 사용
 * UNSPECIFIED: 부모 뷰는 자식 뷰가 원하는 사이즈로 결정
 * EXACTLY: 부모 뷰가 자식 뷰의 사이즈를 정확히 지정할 때
 * AT_MOST: 부모 뷰가 자식 뷰의 최대 사이즈를 지정할 때
 *
 *
 * 2.layout(onLayout)
 * 뷰의 크기와 위치를 할당
 *부모기준의 상대적 위치를 계산
 *
 * 3. draw(onDraw)
 * Canvas: 뷰 모양을 그리는 객체
 * Paint: 뷰의 색상을 칠하는 객체
 *이 콜백은 언제든 다시 호출 될 수 있음
 * 스크롤이나 스와이프를 하게 되면 뷰는 onDraw를 다시 호출한다
 * 그렇기에 객체 할당과 같이 리소스가 많이 소모되는 로직은 추가하면x
 *
 *
 * 4.ViewUpdate(onViewUpdate)
 * 런타임에 뷰를 다시 그리게 하는 함수
 * invalidate: view에 변화가 생겨서 다시 그릴 때
 * requestLayout: view를 처음부터 그려야 할 때
 * */
