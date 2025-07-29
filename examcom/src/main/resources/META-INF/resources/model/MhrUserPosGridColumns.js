/**
 * 所属マスタグリッド定義
 */

let MhrUserPosGridColumns = [];

$(function() {
    MhrUserPosGridColumns = [
        Column.refer('BUSHO_ID', Messages['MhrUserPosGrid.bushoId'], 90, 'primaryKey', 'BUSHO_MEI'),
        Column.refer('SHOKUI_ID', Messages['MhrUserPosGrid.shokuiId'], 90, 'primaryKey', 'SHOKUI_MEI'),
        Column.refer('USER_ID', Messages['MhrUserPosGrid.userId'], 90, 'primaryKey', 'USER_SEI'),
        Column.date('TEKIYO_BI', Messages['MhrUserPosGrid.tekiyoBi'], 90, 'primaryKey', Slick.Formatters.Extends.Date),
        Column.date('SHURYO_BI', Messages['MhrUserPosGrid.shuryoBi'], 90, '', Slick.Formatters.Extends.Date),
        Column.cell('UPDATE_TS', Messages['MhrUserPosGrid.updateTs'], 207, 'metaInfo optLock', Slick.Formatters.Extends.Timestamp),
    ];
});
