
document.querySelector("form").addEventListener("submit", todoList);

function todoList() {
  event.preventDefault();
  var empName = document.querySelector("#name").value;
  var contact = document.querySelector("#contact").value;
  var gender = document.querySelector("#gender").value;
  var address = document.querySelector("#address").value;
  var email = document.querySelector("#email").value;
  var salary = document.querySelector("#salary").value;

  console.log(empName, contact, gender,address,email,salary);

  var tr = document.createElement("tr");
  var td1 = document.createElement("td");
  td1.innerText = empName;
  var td2 = document.createElement("td");
  td2.innerText = contact;
  var td3 = document.createElement("td");
  td3.innerText = gender;
  var td4 = document.createElement("td");
  td4.innerText = address;
  var td5 = document.createElement("td");
  td5.innerText = email;
  var td6 = document.createElement("td");
  td6.innerText = salary;

  tr.append(td1, td2, td3,td4,td5,td6);
  document.querySelector("tbody").append(tr);
}


