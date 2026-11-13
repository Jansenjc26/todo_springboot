const taskList = document.getElementById("task-list");

for (let i = 0; i < 10; i++) {

    const taskRow = document.createElement("div");
    taskRow.className = "task-row";

    taskRow.innerHTML = `
        <input type="checkbox">
        <input type="text">
    `;

    taskList.appendChild(taskRow);
}