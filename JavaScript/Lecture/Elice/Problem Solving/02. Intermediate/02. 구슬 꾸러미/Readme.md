![image](https://user-images.githubusercontent.com/68424403/185841626-b92d1a8f-0577-441d-9558-9acab088a9d0.png)
![image](https://user-images.githubusercontent.com/68424403/185841641-eb35ac5b-3371-4c65-b0fc-99ce0fa10da3.png)


```js
 // 지시사항을 참고하여 solution 함수 안에 코드를 작성하세요. 
function solution(input) {
    let count = 0;
    const arr1 = [250,40,10];
    
    arr1.forEach(bead => {  // forEach: 주어진 함수를 배열 요소 각각에 대해 실행함
        count += parseInt(input/bead);
        input %= bead;
    });

  // 출력할 결과를 return 하세요.
  if (input === 0){   // 무게에 맞춰 꾸러미를 만들 수 있는 경우
      return count;
  } else {   // 무게에 맞춰 꾸러미를 만들 수 없는 경우
      return -1;
  }
}


// 실행 혹은 제출을 위한 코드입니다. 지우거나 수정하지 말아주세요.
module.exports = solution;

```
