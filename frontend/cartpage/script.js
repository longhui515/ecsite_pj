function increaseQuantity(button) {
    const quantityElement = button.previousElementSibling;
    let quantity = parseInt(quantityElement.textContent);
    quantityElement.textContent = ++quantity;
    updateCartCount(1);
    updateTotalPrice();
}

function decreaseQuantity(button) {
    const quantityElement = button.nextElementSibling;
    let quantity = parseInt(quantityElement.textContent);
    if (quantity > 1) {
        quantityElement.textContent = --quantity;
        updateCartCount(-1);
        updateTotalPrice();
    }
}

function removeItem(button) {
    const row = button.closest('tr');
    const quantity = parseInt(row.querySelector('.quantity').textContent);
    updateCartCount(-quantity);
    row.remove();
    updateTotalPrice();
}

function updateTotalPrice() {
    const rows = document.querySelectorAll('.cart-table tbody tr');
    let totalPrice = 0;
    rows.forEach(row => {
        const price = parseInt(row.cells[1].textContent.replace('¥', '').replace(',', ''));
        const quantity = parseInt(row.cells[2].querySelector('.quantity').textContent);
        totalPrice += price * quantity;
    });
    document.querySelector('.total-price').textContent = `Total Price: ¥${totalPrice.toLocaleString()}`;
}

function updateCartCount(amount) {
    const cartCountElement = document.querySelector('.cart-count');
    let cartCount = parseInt(cartCountElement.textContent);
    cartCountElement.textContent = cartCount + amount;
}
