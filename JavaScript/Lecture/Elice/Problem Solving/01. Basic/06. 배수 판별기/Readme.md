![image](https://user-images.githubusercontent.com/68424403/185829529-c8890d80-613f-41a2-a1cd-16045019d74e.png)
![image](https://user-images.githubusercontent.com/68424403/185829535-31dab657-ad18-4c08-9e4a-ccf899c714bd.png)


```javascript
 // 지시사항을 참고하여 solution 함수 안에 코드를 작성하세요. 
function solution(num) {
  var answer = [];
    if (num%2 === 0){
        answer.push("2의 배수입니다.")
    } 
    if (num%3 === 0){
        answer.push("3의 배수입니다.")
    } 
    if (num%5 === 0){
        answer.push("5의 배수입니다.")
    } 
    if (num%7 === 0){
        answer.push("7의 배수입니다.")
    }
  return answer.join("\n");
}


// 실행 혹은 제출을 위한 코드입니다. 지우거나 수정하지 말아주세요.
module.exports = solution;

```
