# Document Object Model (DOM)

- 컴퓨터가 문서를 잘 처리할 수 있도록 문서에 대한 구조를 약속한 것 

- DOM은 트리형태를 통해 표현함 <br> Ex) 태그가 중첩되는 것
- 트리 구조에서 DOM API를 통해서 HTML 요소를 탐색할 수 있음

![image](https://user-images.githubusercontent.com/68424403/187022941-241b91f9-2d00-4fbe-8941-e7a3348a2caa.png)


<br>


## Document object

- document 객체를 통해 js에서 html문서에 접근할 수 있게 된다
(이는 HTML 파일이 DOM에 따라 기술되고, DOM 인터페이스를 통해 기술된 HTML element가 객체로서 js와 연결되기
때문이다)

- 부모와 자식을 오가며 원하는 object에 접근할 수 있음

```js
document.children   // document object에서 children속성을 이용해서 자식인 html 태그에 접근가능
document.children[0].children[0]   // <head> 태그에 접근
document.children[0].children[1]   // <body> 태그에 접근
document.children[0].children[1].parentNode   // 다시 html 태그가 반환
```

<br>

## Element API

```.children``` 해당 object의 자식 노드에 대한 배열 <br>
```.parentNode``` 부모 노드<br>
```.firstElementChild``` 첫 자식 엘리먼트<br>
```.lastElementChild``` 마지막 자식 엘리먼트<br>

<br>

## 특정 Element를 DOM API를 이용하여 얻어오기

- document의 메서드 중 getElement로 시작하는 메서드들이 이러한 기능을 수행함
- 이러한 메서드의 element에 대한 조건을 인자로 전달하면 조건에 부합하는 element를 반환해줌
- ```getElement```로 시작하는 메서드는 하나의 엘리먼트를 반환
- ```getElements```로 시작하는 메서드는 여러개의 엘리먼트를 반환

```js
document.getElementById("해당 id명");
// element의 Id속성을 기준으로 검색하여 해당 Id를 가진 ELement를 반환
// 해당하는 id가 가진 태그가 반환됨

/* 얻어온 element는 innerHTML 속성과 innerText 속성을 조회해보면, p태그 안에 html 코드를 얻어낼 수도, html 코드가 제거된 텍스트를 얻어낼 수도 있음*/ 

```

  
