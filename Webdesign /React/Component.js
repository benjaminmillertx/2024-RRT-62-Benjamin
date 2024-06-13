import React, { useEffect, useState } from 'react';
import axios from 'axios';
import './SkateboardShop.css';

const SkateboardShop = () => {
    const [skateboards, setSkateboards] = useState([]);

    useEffect(() => {
        axios.get('http://localhost:5000/api/skateboards')
            .then(response => {
                setSkateboards(response.data);
            })
            .catch(error => {
                console.error('Error fetching the skateboards:', error);
            });
    }, []);

    return (
        <div className="skateboard-shop">
            <header>
                <div className="logo">
                    <h1>Custom Skateboards</h1>
                </div>
                <nav>
                    <a href="#">Home</a>
                    <a href="#">Shop</a>
                    <a href="#">About Us</a>
                    <a href="#">Testimonials</a>
                    <a href="#">Contact</a>
                    <a href="#"><img src="cart-icon.png" alt="Cart" width="24" /></a>
                </nav>
            </header>
            <section className="hero">
                <h1>Shred the Streets with Our Custom Skateboards</h1>
                <p>Tailor-made for Every Skater’s Style and Performance Needs</p>
                <button>Build Your Board Now</button>
            </section>
            <section className="benefits">
                <div className="benefit">
                    <img src="customization-icon.png" alt="Customization" />
                    <h3>Customized to Your Specs</h3>
                    <p>Choose your deck, wheels, and graphics.</p>
                </div>
                <div className="benefit">
                    <img src="quality-icon.png" alt="Quality" />
                    <h3>High-Quality Materials</h3>
                    <p>Durable and long-lasting skateboards.</p>
                </div>
                <div className="benefit">
                    <img src="craftsmanship-icon.png" alt="Craftsmanship" />
                    <h3>Expert Craftsmanship</h3>
                    <p>Built by skaters, for skaters.</p>
                </div>
                <div className="benefit">
                    <img src="delivery-icon.png" alt="Delivery" />
                    <h3>Fast Delivery</h3>
                    <p>Get your custom board within a week.</p>
                </div>
            </section>
            <section className="testimonials">
                <h2>What Our Customers Say</h2>
                <p>"Best board I’ve ever ridden! The customization options are endless and the quality is top-notch." - Alex R.</p>
                <p>"Absolutely love my new board! The team at Custom Skateboards really knows their stuff." - Jamie L.</p>
                <img src="logos.png" alt="Customer Logos" />
                <p>Rated 4.8/5 on SkateReviews.com and 5/5 on SkaterHub.</p>
            </section>
            <section className="cta">
                <p>Don’t miss out on the ultimate skateboarding experience. Order now and carve your path!</p>
                <button>Get Started</button>
            </section>
            <footer>
                <p>&copy; 2024 Custom Skateboards</p>
                <div>
                    <a href="#">Privacy Policy</a>
                    <a href="#">Terms of Service</a>
                    <a href="#">Facebook</a>
                    <a href="#">Twitter</a>
                    <a href="#">Instagram</a>
                </div>
            </footer>
            <section className="product-list">
                <h2>Available Skateboards</h2>
                <ul>
                    {skateboards.map(skateboard => (
                        <li key={skateboard.id}>
                            <h3>{skateboard.name}</h3>
                            <p>{skateboard.description}</p>
                        </li>
                    ))}
                </ul>
            </section>
        </div>
    );
};

export default SkateboardShop;
