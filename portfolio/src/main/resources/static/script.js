document.getElementById("contactForm").addEventListener("submit", function(e) {
    e.preventDefault();

    const formData = {
        name: this.name.value,
        email: this.email.value,
        message: this.message.value
    };

    fetch("/api/contact", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(formData)
    })
    .then(res => res.text())
    .then(data => {
        document.getElementById("responseMessage").textContent = data;
        this.reset();
    })
    .catch(err => console.error(err));
});
