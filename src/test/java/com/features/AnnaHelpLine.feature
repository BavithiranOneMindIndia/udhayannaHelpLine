Feature: Testing AnnaHelpline
    Verifing Scenarios for AnnaHelpline

    @AnnaHelpLine
    Scenario Outline:  AnnaHelp Line
        Given Access WebDriverManager For AnnaHelpLine
        Then Launch chrome browser for "<Live>" AnnaHelpLine
        Then Click Login for AnnaHelpLine
        Then Enter Phone number for AnnaHelpLine
        Then Then click countinue button AnnaHelpLine
        Then Then click countinue button AnnaHelpLine
        Then Enter otp
        Then Then click countinue button AnnaHelpLine
        Then Wait action for "10" seconds AnnaHelpLine
        Then Click splash screen
        Then Click create new
        Then enter mobile in admin
        Then enter name in admin
        Then Select issue Category
        Then Click create in admin
        Then choose issue location
        Then choose issue street
        Then enter Address
        Then choose issue category
        Then choose issue
        Then choose specific issue
        Then enter issue details
        Then click submit
        Then Verify complaint creation
        Then Quit Browser

        Examples:
            | Website   | Stage                  | Live                 |
            | Framework | Stage.url.annaHelpLine | Live.url.annaHelpine |


    @WebDrivermanager2
    Scenario Outline:  AnnaHelp Line , creating a ticket using webdriver manager
        Given Access WebDriverManager For AnnaHelpLine
        Then Launch chrome browser for "<Live>" AnnaHelpLine
        Then Click Login for AnnaHelpLine
        Then Enter Phone number for AnnaHelpLine
        Then Then click countinue button AnnaHelpLine
        Then Then click countinue button AnnaHelpLine
        Then Enter otp
        Then Then click countinue button AnnaHelpLine
        Then Wait action for "4" seconds AnnaHelpLine
        Then Click splash screen
        Then Click create new
        Then enter mobile in admin
        Then enter name in admin
        Then Select issue Category
        Then Click create in admin
        Then Quit Browser

        Examples:
            | Website   | Stage                  | Live                 |
            | Framework | Stage.url.annaHelpLine | Live.url.annaHelpine |


    @Grid2
    Scenario Outline:  AnnaHelp Line Grid
        Given Access Grid
        Then Launch chrome browser for "<Live>" AnnaHelpLine
        Then Click Login for AnnaHelpLine
        Then Enter Phone number for AnnaHelpLine
        Then Then click countinue button AnnaHelpLine
        Then Then click countinue button AnnaHelpLine
        Then Enter otp
        Then Then click countinue button AnnaHelpLine
        Then Wait action for "4" seconds AnnaHelpLine
        Then Click splash screen
        Then Click create new
        Then enter mobile in admin
        Then enter name in admin
        Then Select issue Category
        Then Click create in admin
        Then Quit Browser

        Examples:
            | Website   | Stage                  | Live                 |
            | Framework | Stage.url.annaHelpLine | Live.url.annaHelpine |

    @Webdriver2
    Scenario Outline:  AnnaHelp Line Grid
        Given Access WebDriverManager For AnnaHelpLine
        Then Launch chrome browser for "<Live>" AnnaHelpLine
        Then Click Login for AnnaHelpLine
        Then Enter Phone number for AnnaHelpLine
        Then Then click countinue button AnnaHelpLine
        Then Then click countinue button AnnaHelpLine
        Then Enter otp
        Then Then click countinue button AnnaHelpLine
        Then Wait action for "4" seconds AnnaHelpLine
        Then Click splash screen
        Then Click create new
        Then enter mobile in admin
        Then enter name in admin
        Then Select issue Category


        Examples:
            | Website   | Stage                  | Live                 |
            | Framework | Stage.url.annaHelpLine | Live.url.annaHelpine |



    @Grid
    Scenario Outline:  AnnaHelp Line Grid
        Given Access Grid
        Then Launch chrome browser for "<Live>" AnnaHelpLine
        Then Click Login for AnnaHelpLine
        Then Enter Phone number for AnnaHelpLine
        Then Then click countinue button AnnaHelpLine
        Then Then click countinue button AnnaHelpLine
        Then Enter otp
        Then Then click countinue button AnnaHelpLine
        Then Wait action for "4" seconds AnnaHelpLine
        Then Click next in Splash Screen
        Then Click new Complaint
        Then choose issue location
        Then choose issue street
        Then enter Address
        Then choose issue category
        Then choose issue
        Then choose specific issue
        Then enter issue details
        Then click submit
        Then Verify complaint creation
        Then Quit Browser

        Examples:
            | Website   | Stage                  | Live                 |
            | Framework | Stage.url.annaHelpLine | Live.url.annaHelpine |



    @AnnaHelpLine002
    Scenario Outline:  AnnaHelp Line 002
        Then Click new Complaint
        Then select issue location
        Then select issue Street
        Then select issue issueCategory
        Then select issue issue
        Then select specific issue
        Then click submit

        Examples:
            | Website   |
            | Framework |


    Scenario Outline:  AnnaHelp Line Grid
        Given Access Grid
        Then Launch chrome browser for "<Live>" AnnaHelpLine
        Then Click Login for AnnaHelpLine
        Then Enter Phone number for AnnaHelpLine
        Then Then click countinue button AnnaHelpLine
        Then Then click countinue button AnnaHelpLine
        Then Enter otp
        Then Then click countinue button AnnaHelpLine
        Then Wait action for "10" seconds AnnaHelpLine
        Then Click next in Splash Screen
        Then Click new Complaint
        Then choose issue location
        Then choose issue street
        Then enter Address
        Then choose issue category
        Then choose issue
        Then choose specific issue
        Then enter issue details
        Then click submit
        Then Verify complaint creation
        Then Quit Browser

        Examples:
            | Website   | Stage                  | Live                 |
            | Framework | Stage.url.annaHelpLine | Live.url.annaHelpine |