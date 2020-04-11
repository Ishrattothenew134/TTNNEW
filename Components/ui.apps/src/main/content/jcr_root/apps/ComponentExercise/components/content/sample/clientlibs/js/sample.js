var $form = $(this).closest("form.foundation-form")
hobby = $form.find("[name='./hobby']").val(),
    if(hobby.length<6)
        alert("enter atleast 6 characters to pass")