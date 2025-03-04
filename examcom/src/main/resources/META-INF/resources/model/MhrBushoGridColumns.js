/**
 * 部署マスタグリッド定義
 */

let MhrBushoGridColumns = [];

$(function() {
    MhrBushoGridColumns = [
        Column.text('BUSHO_ID', Messages['MhrBushoGrid.bushoId'], 80, 'primaryKey numbering', null),
        Column.text('BUSHO_MEI', Messages['MhrBushoGrid.bushoMei'], 300, 'notblank', null),
        Column.refer('OYA_BUSHO_ID', Messages['MhrBushoGrid.oyaBushoId'], 80, '', 'OYA_BUSHO_MEI'),
        Column.date('TEKIYO_BI', Messages['MhrBushoGrid.tekiyoBi'], 80, '', Slick.Formatters.Extends.Date),
        Column.date('SHURYO_BI', Messages['MhrBushoGrid.shuryoBi'], 80, '', Slick.Formatters.Extends.Date),
        Column.cell('UPDATE_TS', Messages['MhrBushoGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
