$(document).ready(function() { 
	$('#job').change(
		function() {
			$.getJSON('/employee/getSalary', {
				jobName : $(this).val(),
				ajax : 'true'
			}, function(data) {
				var html = '';
				var len = data.length;
				for ( var i = 0; i < len; i++) {
					html += '<option value="' + data[i] + '">'
							+ data[i] + '</option>';
				}
				html += '</option>';
 
				$('#salary').html(html);
			});
		});
});