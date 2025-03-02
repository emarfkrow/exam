/**
 * 所属マスタグリッド定義
 */

let MhrShozokuGridColumns = [];

$(function() {
    MhrShozokuGridColumns = [
        Column.refer('BUSHO_ID', Messages['MhrShozokuGrid.bushoId'], 80, 'primaryKey', 'BUSHO_MEI'),
        Column.refer('SHOKUI_ID', Messages['MhrShozokuGrid.shokuiId'], 80, 'primaryKey', 'SHOKUI_MEI'),
        Column.refer('USER_ID', Messages['MhrShozokuGrid.userId'], 80, 'primaryKey', 'USER_SEI'),
        Column.date('TEKIYO_BI', Messages['MhrShozokuGrid.tekiyoBi'], 80, 'primaryKey', Slick.Formatters.Extends.Date),
        Column.date('SHURYO_BI', Messages['MhrShozokuGrid.shuryoBi'], 80, '', Slick.Formatters.Extends.Date),
        Column.cell('UPDATE_TS', Messages['MhrShozokuGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
