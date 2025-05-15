let nums = [1, 3, 5, 3, 1, 7, 8, 8, 1];
let i = 0;
let j = 1;
let result = [];

function setup() {
  createCanvas(650, 300);
  frameRate(5); //controls speed of visualization
}

function draw() {
  background(200);
  let blockWidth = width / nums.length;

  for (let k = 0; k < nums.length; k++) {
    if ((k === i || k === j) && nums[i] === nums[j] && !result.includes(nums[i])) {
      fill("green");
    }
    else {
      fill("white");
    }
    rect(k * blockWidth, 100, blockWidth - 5, -50);
    fill(0);
    textAlign(CENTER, CENTER);
    text(nums[k], k * blockWidth + blockWidth / 2, 75);
  }
  
  //brute force algorithm
  if (nums[i] === nums[j] && !result.includes(nums[i])) {
    result.push(nums[i]);
  }

  j++;
  if (j >= nums.length) {
    i++;
    j = i + 1;
  }
  if (i >= nums.length - 1) {
    noLoop();
  }
  textSize(16);
  text("Duplicates: " + result.join(", "), 250, 150);
}
