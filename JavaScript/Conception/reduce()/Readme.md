# reduce() 메서드

- 자바스크립트 상 Array의 reduce()는 배열의 모든 요소에 대해 각각 연산을 수행(점진적 계산)하여 하나의 결과값을 반환하는 함수
- 배열의 각 요소에 대해 주어진 reducer 함수를 실행하고, 하나의 결과값을 반환함
- 빈 요소를 제외히하고 배열 내에 존재하는 각 요소에 대해 ```callback```함수를 한 번씩 실행함

<br>

## reducer 함수

- 리듀서 함수의 반환 값은 누산기(acc)에 할당되고, 누산기는 순회 중 유지되므로 하나의 값이 최종 결과가 됨

- 기본 꼴
```js
arr.reduce(callback[, initialValue])
```

- 반환 값: 누적 계산의 결과값

<br>

### reducer 함수의 매개변수

- ```callback```: 배열의 각 요소에 대해 실행할 함수. 다음 4가지 인수를 받음
    - ```accumulator```:  누산기는 콜백의 반환값을 누적함
    - ```currentValue```: 처리할 현재 요소 
    - ```currentIndex```: 처리할 현재 요소의 인덱스
    - ```array```: reduce()를 호출한 배열

- ```initialValue```: ```callback```의 최초 호출에서 첫 번째 인수에 제공하는 값<br>
(초기값 미제공시 배열의 첫번째 요소 사용)<br>
(빈 배열에서 초기값 없이 ```reduce()``` 호출시 오류 발생)

<br>

## Array.reduce() 예제 (배열 요소의 합 구하기)

```js
const arr1 = [1,2,3,4,5];

const initialValue = 0;
const sumOfNum = arr1.reduce(
    (previousValue, currentValue) =>
        previousValue+currentValue, initialValue
);

console.log(sumOfNum); // 0+1+2+3+4+5 = 15
```


## 일반 함수를 사용하여 ```reduce()`` 함수 동작과정 살펴보기

```js
const arr1 = [1,2,3,4,5];

function basicFunc(accumulator, currentValue, currentIndex, array){
    console.log("acc: "+accumulator+", cur: "+currentValue
        +", currentIndex: "+currentIndex+", array: "+array);
    return accumulator + currentValue;
}

const initialValue = 0;
const sumOfNum = arr1.reduce(basicFunc, initialValue);

console.log(sumOfNum); // 0+1+2+3+4+5 = 15
```

- Output
```
acc: 0, cur: 1, currentIndex: 0, array: 1,2,3,4,5
acc: 1, cur: 2, currentIndex: 1, array: 1,2,3,4,5
acc: 3, cur: 3, currentIndex: 2, array: 1,2,3,4,5
acc: 6, cur: 4, currentIndex: 3, array: 1,2,3,4,5
acc: 10, cur: 5, currentIndex: 4, array: 1,2,3,4,5
15
```


