$(function() {

	// Solving the active menu problem

	switch (menu) {
	case 'About Us':
		$('#about').addClass('active')
		break;

//	case 'Product List':
//		$('#listProduct').addClass('active')
//		break;
		
	case 'Contact Us':
		$('#contact').addClass('active')
		break;

	default:
		break;
	}
});