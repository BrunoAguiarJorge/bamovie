import { ReactComponent as GithubIcon } from 'assets/img/github.svg';
import './styles.css'
function NavBar() {

    return (
        <header>
            <nav className="container">
                <div className="bamovie-nav-content">
                    <h1 className="bamovie-title">BAMovie</h1>
                    <a href="https://github.com/BrunoAguiarJorge">
                        <div className="bamovie-contact-container">
                            <GithubIcon />
                            <p className="bamovie-contact-link">/dev</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    );
}

export default NavBar;

