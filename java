var count = 0;

function myFunction() {


  count = count + 1;
  console.log(count)
  var number = count;
  document.getElementById("myText").innerHTML = number;
  if(count === 100){
  alert("yoo you got 100 sugarcane congrats")
  }

}
function Functionshop1() {
if (count > "99") {
alert("purchase successfully")
count = 0
myFunction23();
}else if(count < "99") {

alert("YOU DON'T HAVE Enough money")
return 0;
}


}


function myFunction23() {
  var popup = document.getElementById("myPopup");
  popup.classList.toggle("show");
}

