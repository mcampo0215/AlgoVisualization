let nums = [1, 3, 5, 3, 1, 7, 8, 8, 1];
let set = new Set();
let result = [];
let index = 0;

function setup() {
  createCanvas(650, 300);
  frameRate(1); //controls speed of visualization
}

function draw() {
  background(200);
  let blockWidth = width / nums.length;

  for (let i = 0; i < nums.length; i++) {
    if (i === index) {
      fill(255, 204, 0);
    } else if (result.includes(nums[i])) {
      fill("green");
    } else {
      fill("white");
    }
    rect(i * blockWidth, 100, blockWidth - 5, -50);
    fill(0);
    textAlign(CENTER, CENTER);
    text(nums[i], i * blockWidth + blockWidth / 2, 75);
  }
  //optimized algorithm
  if (index < nums.length) {
    let num = nums[index];
    if (set.has(num) && !result.includes(num)) {
      result.push(num);
    }
    set.add(num);
    index++;
  }
  else {
    noLoop();
  }
  textSize(16);
  text("Duplicates: " + result.join(", "), 250, 150);
}
