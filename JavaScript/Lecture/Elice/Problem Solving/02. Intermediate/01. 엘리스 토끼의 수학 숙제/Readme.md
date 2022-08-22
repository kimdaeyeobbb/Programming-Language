![image](https://user-images.githubusercontent.com/68424403/185841161-bac07081-8898-4710-b694-02c1cd425300.png)


```js
 // 지시사항을 참고하여 solution 함수 안에 코드를 작성하세요. 
function solution(num) {
    let sum1 = 0;
    let sum2 = 0;
    for (let i=1; i<=num; i++){
        sum1 += i;
    }
    sum1 = sum1**2;
    
    for (let i=1; i<=num; i++){
        sum2 += (i**2);
    }

  return sum1-sum2;
}


// 실행 혹은 제출을 위한 코드입니다. 지우거나 수정하지 말아주세요.
module.exports = solution;

```
