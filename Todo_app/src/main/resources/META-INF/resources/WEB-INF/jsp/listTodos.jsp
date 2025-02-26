<%@ include file="UI/header.jspf" %>
<%@ include file="UI/nav.jspf" %>
<div class="container">

	<h1>Todos:</h1>
	<table class="table">
		<thead>
			<tr>
				<th>Description</th>
				<th>Target Date</th>
				<th>Completed</th>
				<th></th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
					<td>${todo.description}</td>
					<td>${todo.date}</td>
					<td>${todo.done}</td>
					<td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">DELETE</a></td>
					<td><a href="update-todo?id=${todo.id}" class="btn btn-success">UPDATE</a></td>
				</tr>
			</c:forEach>
				</tbody>
			</table>
			<a href="add-todo" class="btn btn-success">Add Todo</a>
		</div>
		
<%@ include file="UI/footer.jspf" %>