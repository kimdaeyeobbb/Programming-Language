class Human {
  attack() {
    console.log('공격!');
  }
  defense() {
    console.log('방어!');
  }
}

danny = new Human();
danny.attack();
길동 = new Human();
길동.defense();

/* 상속 */
class highhuman extends Human {
  magic() {
    console.log('파이어볼!');
  }
}

ch = new highhuman();
ch.magic();
ch.attack();
ch.defense();
