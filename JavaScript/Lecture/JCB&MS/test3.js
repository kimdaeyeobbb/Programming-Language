let x = 10;
x++;
console.log(x);

console.log(10 in [10, 20, 30]);

let arr1 = [10, 20, 30];
console.dir(arr1); // 모든 property를 알려줌
console.log('length' in arr1);

let obj1 = { one: 1, two: 2 }; // length 존재 X
console.log('length' in obj1); // false

let k = 'hello';
console.log(k[0]); // h
console.log(k[1]); // e

k[0] = 100; // 원시타입의 변수는 변경 불가
console.log(k); // hello

let arr2 = [10, 20, 30];
console.log(arr2[0]); // 10

arr2[0] = 100; // 참조타입의 변수는 값 변경 가능
console.log(arr2[0]); // 100
