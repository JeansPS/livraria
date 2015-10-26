var app = angular.module('livraria', ['ui.bootstrap','ui.router', 'ngResource', 'dialogs.main', 'pascalprecht.translate', 'dialogs.default-translations']);

app.config(['dialogsProvider', function(dialogsProvider){
    dialogsProvider.setSize('sm');
    dialogsProvider.useClass('my-dialog');
}]);

app.config(['$translateProvider', function($translateProvider){

    $translateProvider.translations('pt-BR', {
        DIALOGS_ERROR: "Erro",
        DIALOGS_ERROR_MSG: "Erro desconhecido",
        DIALOGS_CLOSE: "Fechar",
        DIALOGS_PLEASE_WAIT: "Por favor aguarde",
        DIALOGS_PLEASE_WAIT_ELIPS: "Aguarde...",
        DIALOGS_PLEASE_WAIT_MSG: "Aguardando o fim da operação.",
        DIALOGS_PERCENT_COMPLETE: "% Completado",
        DIALOGS_NOTIFICATION: "Notificação",
        DIALOGS_NOTIFICATION_MSG: "Notificação.",
        DIALOGS_CONFIRMATION: "Confirmação",
        DIALOGS_CONFIRMATION_MSG: "Tem certeza?.",
        DIALOGS_OK: "Ok",
        DIALOGS_YES: "Sim",
        DIALOGS_NO: "Não"
    });

    $translateProvider.preferredLanguage('pt-BR');


}]);