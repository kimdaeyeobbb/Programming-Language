# Window Object

- 브라우저에서는 window object를 제공함
- 자바스크립트에서는 해당 winodw 객체를 통해 각종 HTML 요소나, CSS에 접근하고 조작을 가할 수 있음

- 객체에 바인드된 메서드로 실행하지 않을 경우 this는 window임 
<br>(window는 브라우저에서 자바스크립트 실행시 가장 상위에 위치한 객체이기 때문)


- prompt, console 등의 명령은 window 객체가 제공하는 API임
<br>(해당 API를 통해 브라우저에서 동작하는 명령을 내릴 수 있는 것이다)


<br>

- window 사용예시 1
```js
var a = 1;
a;   // 1
window.a;   // 1 (window의 객체로도 접근이 가능)
```


- window 사용예시 2
```js
function b() {
  console.log("b");
}

window.b();   // b -> 객체로서 함수 호출
b();   // b -> 윈도우는 가장 상위에 위치하므로 생략하고 이처럼 호출할 수도 있음
```


- window 사용예시 3
```js
window.location.href   // "about:blank" -> 브라우저의 주소창에 입력된 주소 확인
window.location.href = "http://google.com"   // 페이지가 구글로 이동
```


- window.navigator
    - 브라우저 자체의 정보를 담고있음


- window.screen
    - 현재 디스플레이의 가로/세로 사이즈 등에 대한 정보 포함


- window.document
    - 실제 HTML/CSS에 대한 정보를 담고 있음
    - 이를 통해 HTML/CSS에 접근할 수 있음<br>
          - ```document.body``` -> ```<body></body>```<br>
          - ```document.head``` -> ```<head></head>```

## 결론

- Web Client Side javascript 프로그래밍은 자바스크립트언어로 로직을 작성하고 브라우저에서 제공하는
Window API를 통해 HTML/CSS를 조작하는 것임
