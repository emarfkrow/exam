/**
 * 所属マスタグリッド定義
 */

let MhrShozokuGridColumns = [];

$(function() {
    MhrShozokuGridColumns = [
        Column.refer('BUSHO_ID', Messages['MhrShozokuGrid.bushoId'], 90, 'primaryKey', 'BUSHO_MEI'),
        Column.refer('SHOKUI_ID', Messages['MhrShozokuGrid.shokuiId'], 90, 'primaryKey', 'SHOKUI_MEI'),
        Column.refer('USER_ID', Messages['MhrShozokuGrid.userId'], 90, 'primaryKey', 'USER_SEI'),
        Column.date('TEKIYO_BI', Messages['MhrShozokuGrid.tekiyoBi'], 90, 'primaryKey', Slick.Formatters.Extends.Date),
        Column.date('SHURYO_BI', Messages['MhrShozokuGrid.shuryoBi'], 90, '', Slick.Formatters.Extends.Date),
        Column.cell('UPDATE_TS', Messages['MhrShozokuGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
