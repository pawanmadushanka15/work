function change(){
    document.getElementById("head").innerHTML="Text changed!";
    document.getElementById("second").innerHTML="I am inside the first paragraph";
    let sent=document.getElementById("red");
    sent.style.backgroundColor="green";
    let myDiv=document.getElementById("myDiv");
    myDiv.style.color="purple";
    let second=document.getElementsByTagName('p')[0];
    console.log(second);

}