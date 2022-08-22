![image](https://user-images.githubusercontent.com/68424403/185839673-9cb07552-498a-40fd-941e-1e79a63ce573.png)


```javascript
 // 지시사항을 참고하여 solution 함수 안에 코드를 작성하세요. 
function solution(input) {
    let sum = 0;
    for (let i=0; i<input.length; i++){
        if (input[i] === "웩"){
            return i;    // 웩의 인덱스가 바로 전번째까지의 길이이므로 복통이 지속되는 기간과 동일
        }
    }
}


// 실행 혹은 제출을 위한 코드입니다. 지우거나 수정하지 말아주세요.
module.exports = solution;

```
