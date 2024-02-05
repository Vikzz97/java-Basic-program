let array = [4, 2, 7, 1, 9];
let length = array.length;

for (let i = 0; i < array.length; i++) {
  for (let j = 0 ; j < array.length-1; j++) {
    if (array[j] > array[j+1]) {
      // Swap elements if they are in the wrong order
      let temp = array[j];
      array[j] = array[j+1];
      array[j+1] = temp;
    }
  }
}

console.log(array);