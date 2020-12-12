/**
 * JS의 external 방식..!!
 */
function light(sw) {
    var pic;
    
    if(sw == 0) {
        pic = "https://www.w3schools.com/html/pic_bulboff.gif";
    } else {
        pic = "https://www.w3schools.com/html/pic_bulbon.gif";
    }

    // img의 src의 내용을 변경
    document.getElementById('myImage').src = pic;
}