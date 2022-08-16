let name1 = 'danny';
let age = 20;
console.log('제 이름은 ' + name1 + '입니다. 제 나이는 ' + age + '살 입니다.'); // 옛날 방식
console.log(`제 이름은 ${name1}입니다. 제 나이는 ${age}살 입니다.`); // 요즘 방식 (템플릿 리터럴)

console.log('hello world'.replace('hello', 'hi')); // hi world
console.log('hello world hello'.replace('hello', 'hi')); // hi world hello

//   /hello/g -> hello를 global하게 적용. 모든 곳의 hello르 잡아내서 hi로 바꾸겠다는 뜻
console.log('hello world hello'.replace(/hello/g, 'hi')); // hi world hi

console.log('0'.repeat(100)); // 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
console.log('0'.repeat(100).split(''));
/* 결과값
  '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0',
  '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0',
  '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0',
  '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0',
  '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0',
  '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0',
  '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0',
  '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0',
  '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0',
  '0'
]
*/

let arr3 = [
  { one: 1, two: 2 },
  { 'one-one': 10, 'two-one': 20 },
];
console.log(arr3[0]); // { one: 1, two: 2 }
console.log(arr3[0]['one']); // 1

let arr4 = [10, 20, 30, 40];
arr4.forEach((arr4) => console.log(arr4 ** 2)); // 출력값: 100 400 900 1600

console.log(arr4.map((arr4) => arr4 + 100)); // [ 110, 120, 130, 140 ]

console.log([1, 2, 3, 4, 5, 6, 7].filter((x) => x > 4)); // [ 5, 6, 7 ]

console.log([1, 2, 3, 4, 5, 6, 7].find((x) => x > 4)); // 5

console.log(
  Array(100)
    .fill(0)
    .map((value, index) => value + index)
);
/*
결과값

[
   0,  1,  2,  3,  4,  5,  6,  7,  8,  9, 10, 11,
  12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23,
  24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35,
  36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47,
  48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59,
  60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71,
  72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83,
  84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95,
  96, 97, 98, 99
]
*/

console.log(Array(100)); // 비어있는 100 생성 -> [ <100 empty items> ]
console.log(Array(100).fill(0));
/*
결과값

[
  0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0
]
 */

let x = 1,
  y = 2,
  z = 3;
let obj5 = { x, y, z };
console.log(obj5); // { x: 1, y: 2, z: 3 }

obj5['hello'] = 'world';
console.log(obj5); // { x: 1, y: 2, z: 3, hello: 'world' }

delete obj5['hello'];
console.log(obj5); // { x: 1, y: 2, z: 3 }

console.log(Object.keys(obj5)); // [ 'x', 'y', 'z' ]
console.log(Object.values(obj5)); // [ 1, 2, 3 ]
console.log(Object.entries(obj5)); //  [ [ 'x', 1 ], [ 'y', 2 ], [ 'z', 3 ] ]

let map = new Map();
map.set('one', 100);
map.set('two', 200);
map.set('three', 300);
map.set('four', [10, 20]);

console.log(map);
/*
결과값

Map(4) {
  'one' => 100,
  'two' => 200, 
  'three' => 300,
  'four' => [ 10, 20 ]
}
*/

console.log(map.get('one')); // 100
console.log(map.keys()); //[Map Iterator] { 'one', 'two', 'three', 'four' }
console.log(map.values); // [Function: values]
console.log(map.entries());
/*
결과값

[Map Entries] {
  [ 'one', 100 ],
  [ 'two', 200 ],
  [ 'three', 300 ],
  [ 'four', [ 10, 20 ] ]
}
*/

let test1 = new Map(Object.entries(obj5)); // object 자료형을 map 자료형으로 바꿈
console.log(test1); // Map(3) { 'x' => 1, 'y' => 2, 'z' => 3 }
