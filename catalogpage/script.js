document.addEventListener('DOMContentLoaded', function() {
    const products = [
        { name: '商品1', price: '¥1,000', image: 'https://via.placeholder.com/150' },
        { name: '商品2', price: '¥2,000', image: 'https://via.placeholder.com/150' },
        { name: '商品3', price: '¥3,000', image: 'https://via.placeholder.com/150' },
        { name: '商品4', price: '¥4,000', image: 'https://via.placeholder.com/150' },
        { name: '商品5', price: '¥5,000', image: 'https://via.placeholder.com/150' },
        { name: '商品6', price: '¥6,000', image: 'https://via.placeholder.com/150' },
        { name: '商品7', price: '¥7,000', image: 'https://via.placeholder.com/150' },
        { name: '商品8', price: '¥8,000', image: 'https://via.placeholder.com/150' },
        { name: '商品9', price: '¥9,000', image: 'https://via.placeholder.com/150' },
        { name: '商品10', price: '¥10,000', image: 'https://via.placeholder.com/150' },
        { name: '商品11', price: '¥11,000', image: 'https://via.placeholder.com/150' },
        { name: '商品12', price: '¥12,000', image: 'https://via.placeholder.com/150' },
    ];

    const productList = document.getElementById('productList');

    products.forEach(product => {
        const productItem = document.createElement('div');
        productItem.className = 'product-item';
        
        const productImage = document.createElement('img');
        productImage.src = product.image;
        productImage.alt = product.name;
        
        const productName = document.createElement('h2');
        productName.textContent = product.name;
        
        const productPrice = document.createElement('p');
        productPrice.textContent = product.price;

        productItem.appendChild(productImage);
        productItem.appendChild(productName);
        productItem.appendChild(productPrice);

        productList.appendChild(productItem);
    });
});
