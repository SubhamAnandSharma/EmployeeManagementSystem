    
    // console.log("Hello")
    // logEmployeeList()
    // console.log("World")

    // async function logEmployeeList() {

    //     const response = await fetch("http://localhost:8888/emp/all");
    //     const list = await response.json();
    //     console.log(list);
        
    //     list.map(function(elem){
    //         console.log(elem.employeeName)

    //         var empId = document.createElement("div");
    //         empId.innerText =elem.employeeId;
    
    //         var empName = document.createElement("div");
    //         empName.innerText =elem.employeeName;
    
    //         var empAddress = document.createElement("div")
    //         empAddress.innerText = elem.employeeAddress;
    
    //         var email = document.createElement("div");
    //         email.innerHTML = elem.email;
    
    //         var box=document.createElement('div');
    //         box.setAttribute('id','action');
    
    //         var updateBtn = document.createElement("button");
    //         updateBtn.innerHTML = "Update";
    //         updateBtn.setAttribute("id", "upd")
    //         updateBtn.addEventListener("onClick",updateEmployee(elem.employeeId))

    //         var deleteBtn = document.createElement("button");
    //         deleteBtn.innerHTML = "Delete"
    //         deleteBtn.setAttribute("id","del")
    //         deleteBtn.addEventListener("click", deleteEmployee(elem.employeeId))

    //         var empData = document.createElement("div")
    //         empData.setAttribute("id","empData");
    //         empData.append(empId,empName,empAddress,email,box)

    //         box.append(updateBtn,deleteBtn)
    //         document.querySelector(".data").append(empData);
    
    
    //     })
    // }


    // function updateEmployee(empId){
    //     console.log(empId)
    // }

    // function deleteEmployee(empId){

    // fetch('http://localhost:8888/deleteEmp/'+empId,{
    //         method: 'DELETE',
    //         mode: 'cors',
    //     }).then(res => console.log(res))
    //     //console.log("maybe deleted!")
    // }

    async function logEmployeeList() {
        try {
            const response = await fetch("http://localhost:8888/emp/all");
            const list = await response.json();
            console.log(list);
    
            const dataContainer = document.querySelector(".data");
    
            list.forEach(function (elem) {
                console.log(elem.employeeName);
    
                const empData = createEmployeeDataElement(elem);
                dataContainer.appendChild(empData);
            });
        } catch (error) {
            console.error("Error fetching employee data:", error);
        }
    }
    
    function createEmployeeDataElement(employee) {
        const empData = document.createElement("div");
        empData.setAttribute("class", "empData");
    
        const empId = createDataElement("Employee ID:", employee.employeeId);
        const empName = createDataElement("Employee Name:", employee.employeeName);
        const empAddress = createDataElement("Address:", employee.employeeAddress);
        const email = createDataElement("Email:", employee.email);
    
        const actionBox = createActionBox(employee.employeeId);
        empData.append(empId, empName, empAddress, email, actionBox);
    
        return empData;
    }
    
    function createDataElement(label, value) {
        const div = document.createElement("div");
        div.innerHTML = `<strong>${label}</strong> ${value}`;
        return div;
    }
    
    function createActionBox(empId) {
        const actionBox = document.createElement("div");
        actionBox.setAttribute("class", "action");
    
        const updateBtn = createButton("Update");
        updateBtn.addEventListener("click", () => updateEmployee(empId));
    
        const deleteBtn = createButton("Delete");
        deleteBtn.addEventListener("click", () => deleteEmployee(empId));
    
        actionBox.append(updateBtn, deleteBtn);
        return actionBox;
    }
    
    function createButton(text) {
        const button = document.createElement("button");
        button.innerHTML = text;
        button.setAttribute("class", "btn");
        return button;
    }
    
    async function updateEmployee(empId) {
        console.log("Update employee with ID:", empId);
        // Add your update logic here
    }
    
    async function deleteEmployee(empId) {
        try {
            const response = await fetch(`http://localhost:8888/deleteEmp/${empId}`, {
                method: "DELETE",
                mode: "cors",
            });
            if (response.ok) {
                console.log(`Employee with ID ${empId} deleted successfully.`);
            } else {
                console.error(`Failed to delete employee with ID ${empId}`);
            }
        } catch (error) {
            console.error("Error deleting employee:", error);
        }
    }
    
