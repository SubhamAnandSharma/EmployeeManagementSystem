    

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
        const empData = document.createElement("tr");
        empData.setAttribute("class", "empData");
    
        const empId = createDataElement( employee.employeeId);
        const empName = createDataElement( employee.employeeName);
        const contact = createDataElement( employee.contactNumber);
        const gender = createDataElement( employee.gender);
        const empAddress = createDataElement( employee.employeeAddress);
        const email = createDataElement( employee.email);
        const salary = createDataElement( employee.salary);
    
        const actionBox = createActionBox(employee.employeeId);
        empData.append(empId, empName,contact, empAddress,gender, email,salary, actionBox);
    
        return empData;
    }
    
    function createDataElement(value) {
        const td = document.createElement("td");
        td.innerHTML = value;
        return td;
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
        try {
            const response = await fetch(`http://localhost:8888/emp/${empId}`, {
                method: "PUT",
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

function createEmployee(){
    window.location.href = "index.html";
    console.log(event)
}