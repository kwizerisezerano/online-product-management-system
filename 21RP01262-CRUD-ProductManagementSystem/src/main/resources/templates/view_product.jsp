<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
		<title>Availabel products</title>
		<link rel="stylesheet" 
		href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" 
		integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
		crossorigin="anonymous">
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@6.2.1/css/fontawesome.min.css" integrity="sha384-QYIZto+st3yW+o8+5OHfT6S482Zsvz2WfOzpFSXMF9zqeLcFV0/wlZpMtyFcZALm" crossorigin="anonymous">
	
	</head>
	
	<body bgcolor="#ddd">
		
		<div class="container">	
			<h1 class="d-flex justify-content-center text-warning">PRODUCT MANAGEMENT SYSTEM</h1>
			<h4 class="d-flex justify-content-center text-warning">*********************************************</h4>

			<h2 class="d-flex justify-content-center text-dark">AVAILABLE PRODUCTS IN OUR STOCK</h2>
			
			<hr/>
			
			<a th:href="@{addProduct}" class="btn btn-warning mb-2">Add Product</a>
			
			<table class="table table-bordered table-striped">
				
				<thead class="bg-warning">
					<tr>
					<th>Product Id</th>
					<th>Product name</th>
					<th>Product brand</th>
					<th>Product size</th>
					<th>Product price</th>
					<th>Product management</th>
					</tr>
				</thead>
				
				<tbody>
					<tr th:each="st: ${list}">
						<td th:text="${st.id}"></td>
						<td th:text="${st.pname}"></td>
						<td th:text="${st.pmarc}"></td>
						<td th:text="${st.psize}"></td>
						<td th:text="${st.price}"></td>
						
						<td>
							<a th:href="@{/showUpdateForm(productId=${st.id})}" class="btn btn-warning"> <i class="fa-solid fa-pen fa-beat" style="color: #3b60a0;"></i>Update</a>
							<a th:href="@{/deleteProduct(productId=${st.id})}" class="btn btn-warning  ml-2">Delete</a>
						</td>
					</tr>
				</tbody>
				
			</table>
		</div>
		
	</body>
</html>