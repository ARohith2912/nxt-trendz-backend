INSERT INTO category (name) VALUES ('Electronics'), ('Clothing'), ('Grocery'),('Toys'), ('Appliances');

INSERT INTO products (title, brand, price, image_url, rating, availability, description, total_reviews, category_id, prime_deal)
VALUES
('Laptop', 'Dell', 59999.0, 'IMAGES/Dell-Laptop.jpg', 10, 'In Stock', 'high performance', 80, 1, true),
('Laptop', 'HP', 59999.0, 'IMAGES/HP-Laptop.jpg', 10, 'In Stock', 'high performance', 80, 1, false),
('Laptop', 'MSI', 59999.0, 'IMAGES/MSI-Laptop.jpg', 10, 'In Stock', 'high performance', 80, 1, false),
('Smart Tv', 'LG', 49999.0, 'IMAGES/flat-screen-tv.jpg', 10, 'In Stock', 'full amolnd ', 80, 1, false),
('Smart Watch', 'Apple', 49999.0, 'IMAGES/Apple-watch.jpg', 10, 'In Stock', 'Digital Watch amd more accessible buttons. Battery life upto 36 hrs.', 80, 1, false),
('Smart Watch', 'Boat', 49999.0, 'IMAGES/boat-lunar.jpg', 10, 'In Stock', 'Digital Watch amd more accessible buttons. Calculate calories and heart rate and more..', 80, 1, false),
('Printer', 'LG', 49999.0, 'IMAGES/Hp-printer.jpg', 10, 'In Stock', 'multi-funtionality color laser printer', 80, 1, false),
('Printer', 'LG', 49999.0, 'IMAGES/printer.jpg', 10, 'In Stock', 'designed for home and office use, suitable for everyday documents and photo printing.', 80, 1, false),
('Flash Drive', 'HP', 49999.0, 'IMAGES/flash-drive.jpg', 10, 'In Stock', 'portable data storage devices it can upto 1TB', 80, 1, false),
('Pen-drive', 'sandisk', 49999.0, 'IMAGES/sandisk.jpg', 10, 'In Stock', 'Drive utilizes a USB 2.0 interface for data transfer. Capagilities are avilable upto 1 TB', 80, 1, false),




('Men Shirt', 'Levis', 999.0, 'IMAGES/shirt.jpg', 4, 'In Stock', 'Comfort fit shirt', 250, 2, true),
('Men_Shirt', 'Wood', 999.0, 'IMAGES/T-Shirt.jpg', 4, 'In Stock', 'Comfort fit shirt', 250, 2, false),

('Apple', 'Kashmir', 499.0, 'IMAGES/Apple.jpg', 5, 'In Stock', 'healthy product', 80, 3, false),
('Eggs', 'Hen', 299.0, 'IMAGES/Eggs.jpg', 6, 'In Stock', 'taste product', 80, 3, false),
('grapes', 'Black', 299.0, 'IMAGES/Grapes.jpg', 6, 'In Stock', 'taste product', 80, 3, false),
('Oats', 'Ghana', 499.0, 'IMAGES/oats.jpg', 5, 'In Stock', 'Biscuits made with nutritious oats and are high in fiber.', 80, 3, false),
('Ghee', 'prakesh', 499.0, 'IMAGES/Gawa-ghee.jpg', 5, 'In Stock', 'Rich essential nutrients. Made by Prakesh Dairy Udoya in 1963.', 80, 3, false),
('Ghee', 'Prakesh', 499.0, 'IMAGES/prakesh-ghee.jpg', 5, 'In Stock', '!00% natural and rich in omega 3 and vitamins.', 80, 3, false),
('Rice', 'Wahaj', 499.0, 'IMAGES/rice.jpg', 5, 'In Stock', 'Bashmati rice is a staple in south Asian cusine. Used in dishes like biryani and pulao.', 80, 3, false),
('Chips', 'Lays', 499.0, 'IMAGES/lays.jpg', 5, 'In Stock', 'Chips a tang of all-natural sour cream and mild onions. Describe as delicious fresh-tasting and perfectly toasted.', 80, 3, false),
('Nuts', 'Bajaj', 499.0, 'IMAGES/walnut.jpg', 5, 'In Stock', 'Walnuts are nutrient-dense nuts known as rich-falvour. Contains omega3 fats good for health.', 80, 3, false),
('Nuts', 'Bajaj', 499.0, 'IMAGES/roasted-nuts.jpg', 5, 'In Stock', 'Cashews area good source of healthy fats, protein, and other nutrients', 80, 3, false),
('Nuts', 'Almond', 499.0, 'IMAGES/almond.jpg', 5, 'In Stock', 'Nuts appear to be whole almonds. Maintain freshness', 80, 3, false),
('Coke', 'Coca-Cola', 499.0, 'IMAGES/coke.jpg', 5, 'In Stock', 'Drink has strong ,yet balanced, quinie bitterness with natural flavor', 80, 3, false),
('Thumps UP', 'Coca-Cola', 499.0, 'IMAGES/thumpsup.jpg', 5, 'In Stock', 'Combine Strong and , spicy,and fizzy flavour.', 80, 3, false),
('Soft-Drinks', 'Coca-Cola', 499.0, 'IMAGES/softdrinks.jpg', 5, 'In Stock', 'Coca-Cola produce variety of flavoured soft drinks cans over 200 countries.', 80, 3, false),
('Tonic-Water', 'Schweppas', 499.0, 'IMAGES/Tonic-water.jpg', 5, 'In Stock', 'Sparkling flavoured drink. Used as a mixer with alcohol or fruit juice.', 80, 3, false),
('Frooti', 'Parle', 499.0, 'IMAGES/frooti.jpg', 5, 'In Stock', 'Frooti is a iconic mango drink from India.Drink as fresh and juicy mango flavour', 80, 3, false),
('FrozenBottle', 'Frozen', 499.0, 'IMAGES/frozen-bottle.jpg', 5, 'In Stock', 'Frozen Bottle specializes in serving chilled milkshakes, sundas, mocktails and more..', 80, 3, false),
('Organic Syrup', 'Harney', 499.0, 'IMAGES/organic-syrup.jpg', 5, 'In Stock', 'Certified by USDA Organic', 80, 3, false),
('Dorites Chips Wasabi flavoured', 'Dorites', 499.0, 'IMAGES/dorites.jpg', 5, 'In Stock', 'Wasabi is a green plant similar known as bols spice and unique texture. ', 80, 3, false),
('Crave protein Chips', 'Crave', 499.0, 'IMAGES/protein-chips.jpg', 5, 'In Stock', 'Chips made with organic red lentils. 100% vegan and have a high protein content.', 80, 3, false),

('animal-toys', 'otto', 999.0, 'IMAGES/Animal-toys.jpg', 5, 'In Stock', 'high plastic', 80, 4, false),
('Cars', 'otto', 799.0, 'IMAGES/Cars.jpg', 5, 'In Stock', 'high plastic', 80, 4, true),
('Tractor', 'otto', 799.0, 'IMAGES/Tractor.jpg', 5, 'In Stock', 'high plastic', 80, 4, false),

('Refrigerator', 'LG', 29999.0, 'IMAGES/LG-fridge.jpg', 4, 'In Stock', 'Double door fridge', 70, 5, false),
('Refrigerator', 'SAMSUNG', 29999.0, 'IMAGES/Samsung-Fridge.jpg', 4, 'In Stock', 'Double door fridge', 70, 5, true);



INSERT INTO users (username, password) VALUES ('rahul', 'rahul@123');
INSERT INTO users (username, password) VALUES ('ravi', 'ravi123');
INSERT INTO users (username, password) VALUES ('shiva', 'mani@123');
INSERT INTO users (username, password) VALUES ('mani', 'mani@123');
INSERT INTO users (username, password) VALUES ('rohith', 'rohith@123');



