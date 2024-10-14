package com.example.android_basic

/**
 * Ktlint
 * 코딩 컨벤션에 따라 코드를 작성했는지 확인해주는 도구
 * 즉 코틀린에서 사용되는 lint
 *프로잭트 수준 gradle
 * plugins {
 *     // 기존 플러그인들...
 *     id("org.jlleitschuh.gradle.ktlint") version "12.1.0" apply false
 * }
 * 앱 수준 gradle
 * plugins {
 *     // 기존 플러그인들...
 *     id("org.jlleitschuh.gradle.ktlint")
 * }
 *
 *
 * chmod +x ./gradlew로 gradllew 권한 허용
 *
 *
 * 코드 스타일 검사: 터미널에서 ./gradlew ktlintCheck를 실행
 * 에러가 발생하면 어디에서 지켜지지 않았는지 에러로 보여준다.
 *
 * 코드 자동 포맷: ./gradlew ktlintFormat을 실행
 * 기본 Android lint 사용법: 프로젝트에 오른쪽 마우스 클릭 후 Analyaze > Inspect
 *
 * */
